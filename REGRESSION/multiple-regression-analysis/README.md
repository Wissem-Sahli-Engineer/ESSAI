# Multiple Regression Analysis

This project performs a comprehensive econometric analysis using **Multiple Linear Regression**. It utilizes matrix algebra and statistical libraries to estimate parameters via Ordinary Least Squares (OLS) and verifies the model through rigorous hypothesis testing.

## 📄 Project Overview
The notebook implements a full statistical workflow to analyze the relationship between a dependent variable ($Y$) and three independent variables ($X_1, X_2, X_3$). It manually implements OLS matrix calculations ($\hat{\beta} = (X'X)^{-1}X'Y$) alongside standard libraries to ensure a deep understanding of the underlying econometrics.

## ✨ Features
The analysis covers the following key statistical steps:
* **OLS Estimation:** Calculation of coefficients ($\hat{\beta}$), residuals, and variance.
* **Goodness of Fit:** Computation of $R^2$ and Adjusted $R^2$ (approx 70% variance explained).
* **Hypothesis Testing:**
    * **Fisher's F-test:** Global significance of the model.
    * **Student's t-test:** Testing specific coefficients (e.g., $H_1: a_1 < 1$).
    * **Wald Test:** Joint hypothesis testing for linear constraints.
    * **Chow Test:** Analysis of structural stability across time periods.
* **Diagnostics:**
    * Analysis of standardized residuals and leverage points (Hat Matrix).
    * Confidence intervals for error variance.
* **Visualization:** Plots for fitted values vs. observed values and residual distribution.

## 📊 Dataset
The project uses a structured dataset with 14 observations:
* **Dependent Variable:** `y`
* **Independent Variables:** `x1`, `x2`, `x3`
* **Time:** `t` (1 to 14)

## 🛠️ Installation & Usage

### 1. Clone the Repository
```bash
git clone [https://github.com/Wissem-Sahli-Engineer/multiple-regression-analysis.git](https://github.com/Wissem-Sahli-Engineer/multiple-regression-analysis.git)
cd multiple-regression-analysis
